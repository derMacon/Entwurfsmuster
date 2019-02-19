package headfirst.proxy.javaproxy;

public interface PersonBean {
 
	String getName();
	String getGeschlecht();
	String getInteressen();
	int getHotOrNotBewertung();
 
    void setName(String name);
    void setGeschlecht(String gender);
    void setInteressen(String interests);
    void setHotOrNotBewertung(int rating); 
 
}
