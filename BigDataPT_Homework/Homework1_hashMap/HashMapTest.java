public class HashMapTest {

    public static void main(String[] args) {

        HashMapImplement<String, String> hm = new HashMapImplement<String, String>();
        hm.put("苟", "岂");
        hm.put("利", "因");
        hm.put("国", "福");
        hm.put("家", "祸");
        hm.put("生", "趋");
        hm.put("死", "避");
        hm.put("以", "之");

        System.out.println(hm.get("苟"));
        System.out.println(hm.get("利"));
        System.out.println(hm.get("国"));
        System.out.println(hm.get("家"));
        System.out.println(hm.get("生"));
        System.out.println(hm.get("死"));
        System.out.println(hm.get("以"));
        hm.remove("苟");
        System.out.println(hm.get("苟"));

//
    }

}
