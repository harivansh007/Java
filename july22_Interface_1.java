interface F
{
    void m1();
}

interface K extends F
{
    void m2();
}
interface W
{
    void m3();
}

class Tem
{

}

class FWK extends Tem implements W,K
{
    @Override 
public void m1() {
    
}@Override 
public void m2() {
    
}
@Override 
public void m3() {
    
}
}