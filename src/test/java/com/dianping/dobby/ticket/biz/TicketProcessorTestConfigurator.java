package com.dianping.dobby.ticket.biz;

import java.util.ArrayList;
import java.util.List;

import org.unidal.lookup.configuration.AbstractResourceConfigurator;
import org.unidal.lookup.configuration.Component;

import com.dianping.dobby.ticket.biz.TicketManager;
import com.dianping.dobby.ticket.biz.TicketProcessorTest.MockTicketManager;

public class TicketProcessorTestConfigurator extends AbstractResourceConfigurator {
	@Override
	public List<Component> defineComponents() {
		List<Component> all = new ArrayList<Component>();

		all.add(C(TicketManager.class, MockTicketManager.class));

		return all;
	}

	@Override
	protected Class<?> getTestClass() {
		return TicketProcessorTest.class;
	}

	public static void main(String[] args) {
		generatePlexusComponentsXmlFile(new TicketProcessorTestConfigurator());
	}
}
