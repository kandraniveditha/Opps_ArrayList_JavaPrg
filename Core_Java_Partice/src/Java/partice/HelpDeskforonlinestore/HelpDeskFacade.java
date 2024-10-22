package Java.partice.HelpDeskforonlinestore;


public interface HelpDeskFacade {
	
	void addNewSupportTicket(SupportTicket supportTicket);
	
	SupportTicket getNextSupportTicket();

	int getNumberOfTickets();
}
