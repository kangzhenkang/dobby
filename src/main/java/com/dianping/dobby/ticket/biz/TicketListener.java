package com.dianping.dobby.ticket.biz;

public interface TicketListener {
	public void beforeStateChange(TicketContext ctx) throws Exception;

	public void afterStateChange(TicketContext ctx) throws Exception;
}
