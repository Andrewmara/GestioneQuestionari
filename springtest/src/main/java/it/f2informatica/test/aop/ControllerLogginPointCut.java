package it.f2informatica.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class ControllerLogginPointCut {
	private static Logger logger = LoggerFactory.getLogger(ControllerLogginPointCut.class);

	@After("execution(* it.f2informatica.test.controller..*(..))")
	public void log(JoinPoint point) {
		logger.debug("Chiamato il metodo: {}, argomenti {}", point.getSignature().getName(), point.getArgs());
	}
}
