package com.axiomega.nocbot.client;

import java.util.HashMap;
import java.util.Map;

import com.axiomega.nocbot.sdk.NocbotClient;
import com.axiomega.nocbot.sdk.session.Account;
import com.axiomega.nocbot.sdk.session.Call;
import com.axiomega.nocbot.sdk.session.NocbotRestException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NocbotRestException
    {
        NocbotClient client = new NocbotClient();
        Account mainAccount = client.getAccount();
        Map<String, String> callParams = new HashMap<String, String>();
		callParams.put("To", "5105551212"); // Replace with a valid phone number
		callParams.put("From", "(510) 555-1212"); // Replace with a valid phone
													// number in your account
		callParams.put("Url", "http://demo.twilio.com/welcome/voice/");
		Call call = mainAccount.getCallFactory().create(callParams);
		System.out.println(call.getSid());
    }
}
