
import jade.core.*;
import jade.core.behaviours.*;
import jade.domain.*;
import jade.domain.FIPAAgentManagement.*;
import jade.lang.acl.*;

public class Agents extends Agent{
    protected float satisfaction;
    protected Marchandise prod;
    protected Marchandise cons;
    protected int maxstock;
    protected int prodRate;
    protected int consRate;
    protected float solde;

    
    protected void setup(){
        
        ServiceDescription sd  = new ServiceDescription();
        sd.setType( "compute" );
        sd.setName( "a compute agent" );
        register( sd );
        
        addBehaviour(new OneShotBehaviour() {			
			@Override
			public void action() {
				System.out.println("Agent Created");
			}
		});
    }


    void register( ServiceDescription sd) {
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(getAID());
        dfd.addServices(sd);
    
        try {
          DFService.register(this, dfd );
        }
        catch (FIPAException fe) { fe.printStackTrace(); }
    }
}