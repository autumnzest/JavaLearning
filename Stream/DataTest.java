import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataTest {
	public static void main(String[] args) {
		//filterSex();
		
		//filterSexAndAge();
		
		//getUserNameList();
		
		//flatMapString();
		
		//reduceTest();
		
		//toListTest();
		
		//toMapTest();
		
		//toSetTest();
		
		//toTreeSetTest();
		
		//toGroupTest();
		
		//toJoiningTest();
		
		//reduce();
		
		//sortTest();
		
		//peekTest();
	}
	
	/**
     * all men to list
     * 
     * fiter:
     */
    public static void filterSex(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())){
                temp.add(person);
            }
        }
        System.out.println(temp);
        //new ver 1.8
        List<PersonModel> collect = data
                .stream()
                .filter(person -> "男".equals(person.getSex()))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    /**
     * all men and age < 20
     * 
     * fiter:
     */
    public static void filterSexAndAge(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())&&person.getAge()<20){
                temp.add(person);
            }
        }
        System.out.println(temp);
        //new 1 ver 1.8
        List<PersonModel> collect = data
                .stream()
                .filter(person -> {
                    if ("男".equals(person.getSex())&&person.getAge()<20){
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
        System.out.println(collect);
        //new 2 ver 1.8
        List<PersonModel> collect1 = data
                .stream()
                .filter(person -> ("男".equals(person.getSex())&&person.getAge()<20))
                .collect(Collectors.toList());
        System.out.println(collect1);

        
        // women whose name contains w
        List<PersonModel> col3 = data.stream()
        		.filter(person -> ("女".equals(person.getSex())&&person.getName().contains("w")))
        		.collect(Collectors.toList());
        System.out.println(col3);
    }
    
    /**
     * get all the people's name
     * 
     * map:
     */
    public static void getUserNameList(){
        List<PersonModel> data = Data.getData();

        //old
        List<String> list=new ArrayList<>();
        for (PersonModel persion:data) {
            list.add(persion.getName());
        }
        System.out.println(list);

        //new 1 ver 1.8
        List<String> collect = data.stream().map(person -> person.getName()).collect(Collectors.toList());
        System.out.println(collect);

        //new 2 ver 1.8
        List<String> collect1 = data.stream().map(PersonModel::getName).collect(Collectors.toList());
        System.out.println(collect1);

        //new 3 ver 1.8
        List<String> collect2 = data.stream().map(person -> {
            System.out.println(person.getName());
            return person.getName();
        }).collect(Collectors.toList());
    }
    
    /**
     * get all the people's name
     * 
     * flatMap:
     */
    public static void flatMapString() {
        List<PersonModel> data = Data.getData();
        //return a different type
        List<String> collect = data.stream()
                .flatMap(person -> Arrays.stream(person.getName().split(" "))).collect(Collectors.toList());
        System.out.println(collect);

        //by map
        List<Stream<String>> collect1 = data.stream()
                .map(person -> Arrays.stream(person.getName().split(" "))).collect(Collectors.toList());
        System.out.println(collect1);

        //map instead of flatmap 
        List<String> collect2 = data.stream()
                .map(person -> person.getName().split(" "))
                .flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(collect2);
        
        //map instead of flatmap No2
        List<String> collect3 = data.stream()
                .map(person -> person.getName().split(" "))
                .flatMap(str -> Arrays.asList(str).stream()).collect(Collectors.toList());
        System.out.println(collect3);

    }
    /**
     * reduce
     * 
     * method like sum
     */
    public static void reduceTest(){

        Integer reduce = Stream.of(1, 2, 3, 4)
                .reduce(10, (count, item) ->{
            System.out.println("count:"+count);
            System.out.println("item:"+item);
            return count + item;
        } );
        System.out.println(reduce);

        Integer reduce1 = Stream.of(1, 2, 3, 4)
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce1);

        String reduce2 = Stream.of("1", "2", "3")
                .reduce("0", (x, y) -> (x + "," + y));
        System.out.println(reduce2);
    }
    
    /**
     * toList
     */
    public static void toListTest(){
        List<PersonModel> data = Data.getData();
        List<String> collect = data.stream()
                .map(PersonModel::getName)
                .collect(Collectors.toList());
    }

    /**
     * toSet
     */
    public static void toSetTest(){
        List<PersonModel> data = Data.getData();
        Set<String> collect = data.stream()
                .map(PersonModel::getName)
                .collect(Collectors.toSet());
    }

    /**
     * toMap
     */
    public static void toMapTest(){
        List<PersonModel> data = Data.getData();
        Map<String, Integer> collect = data.stream()
                .collect(
                        Collectors.toMap(PersonModel::getName, PersonModel::getAge)
                );

        data.stream()
                .collect(Collectors.toMap(per->per.getName(), value->{
            return value+"1";
        }));
    }

    /**
     * to a type whatever u want
     */
    public static void toTreeSetTest(){
        List<PersonModel> data = Data.getData();
        TreeSet<PersonModel> collect = data.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect);
    }

    /**
     * group by
     */
    public static void toGroupTest(){
        List<PersonModel> data = Data.getData();
        Map<Boolean, List<PersonModel>> collect = data.stream()
                .collect(Collectors.groupingBy(per -> "男".equals(per.getSex())));
        System.out.println(collect);
    }

    /**
     * the mark of beginning ending and separator
     */
    public static void toJoiningTest(){
        List<PersonModel> data = Data.getData();
        String collect = data.stream()
                .map(personModel -> personModel.getName())
                //.collect(Collectors.joining(",", "{", "}"));
                .collect(Collectors.joining("->", "＜＜", "＞＞"));
        System.out.println(collect);
    }

    /**
     * customize
     */
    public static void reduce(){
        List<String> collect = Stream.of("1", "2", "3").collect(
                Collectors.reducing(new ArrayList<String>(), x -> Arrays.asList(x), (y, z) -> {
                    y.addAll(z);
                    return y;
                }));
        System.out.println(collect);
    }
    
    /**
     * sort
     */
    public static void sortTest() {
        List<PersonModel> data = Data.getData();
        data.stream()
        .map(e -> e.getAge())
        .sorted()
        .forEach(System.out::println);
    }
    
    /**
     * peek: dont stop the stream
     */
    private static void peekTest() {
        List<PersonModel> data = Data.getData();

		data.stream()
		.map(per -> per.getName())
		.peek(p -> System.out.println("mapName:"+p))
		.map(pern -> pern.toUpperCase())
		.peek(p -> System.out.println("upName:"+p))
		.collect(Collectors.toList());
    }
}
