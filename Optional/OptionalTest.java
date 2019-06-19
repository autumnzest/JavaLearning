import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) throws Exception {


        PersonModel personModel=new PersonModel();

        System.out.println(getLastName(personModel));
        
        System.out.println(getLastName2(personModel));

    }
	
	/**
	 * old
	 * @param personModel
	 * @return
	 * @throws Exception
	 */
	private static String getLastName(PersonModel personModel) throws Exception{
        if(personModel!=null){
            if(personModel.getEarthModel()!=null){
            	EarthModel earthModel = personModel.getEarthModel();
                if(earthModel.getLastName()!=null){
                    return earthModel.getLastName();
                }
            }
        }
        throw new Exception("error"); 
	}
	
	/**
	 * new java 8
	 * @param personModel
	 * @return
	 * @throws Exception
	 */
	private static String getLastName2(PersonModel personModel) throws Exception{
	    return Optional.ofNullable(personModel)
	                   .map(u-> u.getEarthModel())
	                   .map(a->a.getLastName())
	                   .orElseThrow(()->new Exception("error"));
	}
}
