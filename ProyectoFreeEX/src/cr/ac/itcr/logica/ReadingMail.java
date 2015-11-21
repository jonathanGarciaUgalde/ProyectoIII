package cr.ac.itcr.logica;

import java.util.*;
import javax.mail.*;


public class ReadingMail {
	
	/**
     * Utility method to read simple IMAP email
     * @param email
     * @param password
     */
	public void Reader(String email, String password){
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", email, password);
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            Message msg = inbox.getMessage(inbox.getMessageCount());
            Address[] in = msg.getFrom();
            for (Address address : in) {
                System.out.println("DE:" + address.toString());
            }
            Object mp = (Object) msg.getContent();
            System.out.println("FECHA:" + msg.getSentDate());
            System.out.println("ASUNTO:" + msg.getSubject());
            System.out.println(mp.toString());
            
            
        } catch (Exception mex) {
            mex.printStackTrace();
        
    }
}
	
}
