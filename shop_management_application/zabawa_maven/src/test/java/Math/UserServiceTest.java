package Math;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {
    @Test
    public void testUserServiceIsAny1(){
        List<String> s = new ArrayList<String>();
        s.add("adam");
        //mozna zrobić tablic i potem dodać tablice jako kolekcje

        //ZAPYTAć PANA JAK DODAWAć KILKA NARAZ
        //czyli czy można UserService user = new UserService("adam", "wojtek", "krzysiek")


        UserService user = new UserService(s);

        boolean IsAny = user.IsAny();

        Assert.assertTrue(IsAny);

    }
    @Test
    public void testUserServiceIsAny2(){
        List<String> s = new ArrayList<String>();
        s.add("adam");
        s.add("piotr");
        s.add("michal");

        UserService user = new UserService(s);

        boolean IsAny = user.IsAny();

        Assert.assertTrue(IsAny);

    }
    @Test
    public void testUserServiceIsAny3(){
        List<String> s = new ArrayList<String>();

        UserService user = new UserService(s);

        boolean IsAny = user.IsAny();

        Assert.assertFalse(IsAny);

    }


    @Test
    public void testUserServiceHowMany1(){
        List<String> s = new ArrayList<String>();
        s.add("adam");


        UserService user = new UserService(s);

        int howmany = user.HowMany();

        Assert.assertEquals(1, howmany);

    }
    @Test
    public void testUserServiceHowMany2(){
        List<String> s = new ArrayList<String>();
        s.add("adam");
        s.add("piotr");
        s.add("michal");

        UserService user = new UserService(s);

        int howmany = user.HowMany();

        Assert.assertEquals(3, howmany);

    }
    @Test
    public void testUserServiceHowMany3(){

        List<String> s = new ArrayList<String>();


        UserService user = new UserService(s);

        int howmany = user.HowMany();

        Assert.assertEquals(0, howmany);

    }
}