package com.star.sud.dialect;

/*
 * @Author Sudarshan
 */

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

public class StarDialect extends AbstractDialect {

	private Set<IProcessor> processors = new HashSet<IProcessor>();

	public String getPrefix() {
		return "dia";
	}

	@Override
	public boolean isLenient() {
		return true;
	}

	@Override
	public Set<IProcessor> getProcessors() {
		return processors;
	}

	public void setProcessors(Set<IProcessor> processors) {
		this.processors = processors;
	}

}
