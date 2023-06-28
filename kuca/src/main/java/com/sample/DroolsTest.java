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
        	
        	Krov k = new Krov();
        	k.setCrepoviNedostaju(40);
        	k.setDrvoIznadKrova(false);
        	k.setKvadratura(74.53);
        	k.setOluciZardjali(true);
        	k.setUlegaoKrov(true);
        	k.getProkisnjava().add("po sredini");
        	k.getProkisnjava().add("po ivici");
            kSession.insert(k);
            kSession.fireAllRules();
            
            System.out.println(k);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
