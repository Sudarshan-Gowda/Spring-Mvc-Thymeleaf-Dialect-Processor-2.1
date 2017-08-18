package com.star.sud.processor;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;

import com.star.sud.service.StarPlayerDataService;

@Component("starMenuProcessor")
public class StarMenuProcessor extends AbstractModelVariableModifierProcessor {

	@Resource(name = "starPlayerDataService")
	protected StarPlayerDataService starPlayerDataService;

	public StarMenuProcessor() {
		super("star");
	}

	public int getPrecedence() {
		return 10000;
	}

	@Override
	protected void modifyModelAttributes(Arguments arguments, Element element) {
		String resultVar = element.getAttributeValue("sn");

		addToModel(arguments, resultVar, starPlayerDataService.getPlayerData());
	}
}
