package Java_Interview_Questions.day05;

import java.util.*;

public class Q04_MapTask {
    // PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]


// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]

// PART 2
// find how many members each group has

// BÖLÜM 2
// her grubun kaç üyesi olduğunu bul
public static void main(String[] args) {
    HashMap<String, ArrayList<String>> groupMembers = new HashMap<>();

    ArrayList<String>team1 = new ArrayList<>(Arrays.asList("gamze","merve","sümeyra","ramazan"));
    ArrayList<String>team2 = new ArrayList<>(Arrays.asList("hakan","yunus","gursoy","yakup"));
    groupMembers.put("teamA ", team1);
    groupMembers.put("teamB ", team2);
    System.out.println("groupMembers = " + groupMembers);

    Collection<ArrayList<String>> values =groupMembers.values();
    for(ArrayList<String> each : values){
        System.out.println("each.size() = " + each.size());
    }

    Set<String> keys =groupMembers.keySet();
    for(String each : keys){
        ArrayList<String> uyeListesi = groupMembers.get(each);
        System.out.println("uyeListesi.size() = " + uyeListesi.size());
    }


}
}
