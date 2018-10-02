public class Test {

    @org.testng.annotations.Test
    public void testArea(){
        Sqrt s1 = new Sqrt(5);
        assert s1.sqrt1() == 25;
    }
}
