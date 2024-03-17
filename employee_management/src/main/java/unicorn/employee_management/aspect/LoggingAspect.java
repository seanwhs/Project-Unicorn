//LoggingAspect.java
package unicorn.employee_management.aspect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private final Logger log = LoggerFactory.getLogger(LoggingAspect.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Pointcut("execution(* unicorn.employee_management..*(..))")
    public void loggingPointCut() {
    }

    @Around("loggingPointCut()")
    public Object loggingAdvice(ProceedingJoinPoint pointJoin) throws Throwable {
        String methodName = pointJoin.getSignature().getName();
        String className = pointJoin.getTarget().getClass().getSimpleName();
        Object[] arguments = pointJoin.getArgs();

        logRequest(className, methodName, arguments);

        Object response = pointJoin.proceed();

        logResponse(className, methodName, response);

        return response;
    }

    private void logRequest(String className, String methodName, Object[] arguments) {
        try {
            String requestJson = objectMapper.writeValueAsString(arguments);
            log.info("Empl_Appln:: Request: {}.{}() with arguments: {}", className, methodName, requestJson);
        } catch (JsonProcessingException e) {
            log.error("Empl_Appln:: Failed to log request for {}.{}()", className, methodName, e);
        }
    }

    private void logResponse(String className, String methodName, Object response) {
        try {
            String responseJson = objectMapper.writeValueAsString(response);
            log.info("Empl_Appln:: Response: {}.{}() with response: {}", className, methodName, responseJson);
        } catch (JsonProcessingException e) {
            log.error("Empl_Appln:: Failed to log response for {}.{}()", className, methodName, e);
        }
    }
}