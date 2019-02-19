package headfirst.proxy.javaproxy;
 
import java.lang.reflect.*;
 
public class NichtEigentuemerInvocationHandler implements InvocationHandler { 
	PersonBean person;
 
	public NichtEigentuemerInvocationHandler(PersonBean person) {
		this.person = person;
	}
 
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
   			} else if (method.getName().equals("setHotOrNotBewertung")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
