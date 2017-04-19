//package controller;


package softcons.lab7.view;
import controller.Executioner;
import java.util.ArrayList;
import dao.HullDao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import softcons.lab7.model.Hull;

/**
 *
 * @author ibrah
 */
public class Lab7 {
    public static void main(String[] args) {
                Scanner scanf = new Scanner(System.in);
        // TODO code application logic here
        String csv = "test_two-anon.csv";
        String line;
        int x=0;
        List<String> list = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {

            
            while((line = br.readLine()) != null)
            {
                list.add(line);
            }

//            String[] stringArr = list.toArray(new String[0]);
            //System.out.println(list.get(0));

        } catch (IOException e) {
            e.printStackTrace();
        }
        
		ArrayList<Hull> newHulls = new ArrayList<Hull>();
                
//		Hull hull=new Hull();  
//		hull.setId(1001);  hull.setSCHEME("Fahad");//  hull.setCountry("Satti");
//		newHulls.add(hull);
//		
//		Hull hull1=new Hull();  
//		hull1.setId(1002);  hull1.setSCHEME("Tahir"); // city1.setCountry("Azim");
//                newHulls.add(hull1);

                 int newid=0;
                 int temp = 2;
                 int size = list.size();
                 Hull hull; //= new City();
                 String[] data;
                 while(temp!=size){
                            hull = new Hull();
                            data = list.get(temp).split(",");
                            System.out.println(data.length);
                            for (int it=0;it<data.length;it++)
                            {
                                if(!data[it].equals("\"\""))
                                    data[it]= data[it].substring(1,data[it].length()-1);
                            }
                            //System.out.println(data.length);
                            hull.setId(newid);
                            if(data.length>0)
                            hull.setUSERID(data[0]);
                            if(data.length>2)
                            hull.setSCHEME(data[2]);
                            if(data.length>3)
                            if(!data[3].equals("\"\""))
                                hull.settTime(Double.valueOf(data[3]));
                            if(data.length>4)
                            hull.setState(data[4]);
                            if(data.length>6)
                            if(!data[6].equals("\"\""))
                                hull.setFirstTime(Double.valueOf(data[6]));
                            if(data.length>7)
                            hull.setState1(data[7]);
                            if(data.length>9)
                            if(!data[9].equals("\"\""))
                                hull.setSecondTime(Double.valueOf(data[9]));
                            if(data.length>10)
                            hull.setState2(data[10]);
                            if(data.length>12)
                            if(!data[12].equals("\"\""))
                                hull.setThirdTime(Double.valueOf(data[12]));
                            if(data.length>13)
                            hull.setState3(data[13]);
                            if(data.length>15)
                            if(!data[15].equals("\"\""))
                                hull.setFourthTime(Double.valueOf(data[15]));
                            if(data.length>16)
                            hull.setState4(data[16]);
                            if(data.length>18)
                            if(!data[18].equals("\"\""))
                                hull.setFifthTime(Double.valueOf(data[18]));
                            if(data.length>19)
                            hull.setState5(data[19]);
                            if(data.length>21)
                            if(!data[21].equals("\"\""))
                                hull.setSixthTime(Double.valueOf(data[21]));
                            if(data.length>22)
                            hull.setState6(data[22]);
                            if(data.length>24)
                            if(!data[24].equals("\"\""))
                                hull.setSeventhTime(Double.valueOf(data[24]));
                            if(data.length>25)
                            hull.setState7(data[25]);
                            //if(!data[4].equals("\"\"")&& !data[4].equals("")){  
//                            city.setPostalCode(data[4]);}
//                            city.setLatitude(Float.valueOf(data[5]));
//                            city.setLongitude(Float.valueOf(data[6]));
//                            if(data.length>7 && !data[7].equals("\"\"") && !data[7].equals("")){  
//                            city.setMetroCode(Integer.parseInt(data[7]));}
//                            if(data.length>8 && !data[8].equals("\"\"")&& !data[8].equals("")){  
//                            city.setAreaCode(Integer.parseInt(data[8]));}
//                            session.persist(city);
                            temp++;
                            newid++;
                            newHulls.add(hull);
//                            t.commit();//transaction is commited  
                            hull = null;
                        }
                
                
    		HullDao hullDao = new HullDao();
		
		try{
			hullDao.save(newHulls);
		}finally{
			hullDao.finalize();
		}
	}
    
}
