package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            Auto a = new Auto();
            a.setSnagaMotora(50);
            a.setNovoVozilo(false);
            a.setPremijskiStepenPrethodnaGodina(4);
            a.setNezgode(3);
            
            kSession.insert(a);
            kSession.fireAllRules();
            System.out.println(a);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
