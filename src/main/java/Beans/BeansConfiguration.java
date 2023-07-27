package Beans;

import org.springframework.context.annotation.Configuration;

import com.example.Pizza.Classi.Pizza;
import com.example.Pizza.Classi.Tavolo;
import com.example.Pizza.Classi.User;

@Configuration
public class BeansConfiguration {
	
	Tavolo getTavolo01() {
		return new Tavolo(1, 3);
	}
	
	Tavolo getTavolo02() {
		return new Tavolo(2, 10);
	}
	
	Tavolo getTavolo03() {
		return new Tavolo(3, 2);
	}
	
	Pizza getPizza01 () {
		
		return new Pizza ("margherita",7.50, 600);
	}
	
    Pizza getPizza02 () {
		
		return new Pizza ("Capricciosa",9, 700);
	}

    Pizza getPizza03 () {
	
	    return new Pizza ("Napoli", 7, 680);
	
    }
    
    User getUser01() {
    	
    	return new User ("Luca", "Iannice", getTavolo01());
    }
    
    User getUser02() {
    	
    	return new User ("Sante", "Sante", getTavolo02());
    }
    
    User getUser03() {
    	
    	return new User ("Francesca", "Arata", getTavolo01());
    }
    
    User getUser04() {
    	
    	return new User ("Marco", "Tumminia", getTavolo02());
    }
    
    User getUser05() {
    	
    	return new User ("Ariana", "Kirsch", getTavolo03());
    }
		
	
	

}

