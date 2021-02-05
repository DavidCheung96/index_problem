import java.util.*;

public class index_problem {

    private static List<String> sortStringListByLength(List<String> list) {
        Collections.sort(list, Comparator.comparing(String::length));
        return list;
    }

    public String makeName(List<String> names) {
        List<String> sortedNames = sortStringListByLength(names);
        StringBuilder indexName = new StringBuilder(sortedNames.get(sortedNames.size() - 1));
        for (String name : sortedNames) {
            if (!indexName.toString().contains(name)) {
                switch (name.length()){
                    case 2:
                        if(indexName.substring(0,1).equals(name.substring(1, 2))){
                            indexName.insert(0, name.substring(0, 1));
                        }
                        else if(indexName.substring(indexName.length()).equals(name.substring(0, 1))){
                            indexName.append(name.substring(1, 2));
                        }
                        else indexName.append(name);
                        continue;
                    case 3:
                        if(indexName.substring(indexName.length()-2).equals(name.substring(0, 2))){
                            indexName.append(name.substring(2, 3));
                        }
                        else if(indexName.substring(0,2).equals(name.substring(1,3))){
                            indexName.insert(0, name.substring(0, 1));
                        }
                        else if(indexName.substring(0,1).equals(name.substring(2, 3))){
                            indexName.insert(0, name.substring(0, 2));
                        }
                        else if(indexName.substring(indexName.length()-1).equals(name.substring(0, 1))){
                            indexName.append(name.substring(1, 3));
                        }
                        else indexName.append(name);
                        continue;
                    case 4:
                        if(indexName.substring(indexName.length()-3).equals(name.substring(0, 3))){
                            indexName.append(name.substring(3, 4));
                        }
                        else if(indexName.substring(0,3).equals(name.substring(1, 4))){
                            indexName.insert(0, name.substring(0, 1));
                        }
                        else if(indexName.substring(indexName.length()-2).equals(name.substring(0, 2))){
                            indexName.append(name.substring(2, 4));
                        }
                        else if(indexName.substring(0,2).equals(name.substring(2, 4))){
                            indexName.insert(0, name.substring(0, 2));
                        }
                        else if(indexName.substring(0,1).equals(name.substring(3, 4))){
                            indexName.insert(0, name.substring(0, 3));
                        }
                        else if(indexName.substring(indexName.length()-1).equals(name.substring(0, 1))){
                            indexName.append(name.substring(1, 4));
                        }
                        else indexName.append(name);
                        continue;
                    case 5:
                        if(indexName.substring(indexName.length()-4).equals(name.substring(0, 4))){
                            indexName.append(name.substring(4, 5));
                        }
                        else if(indexName.substring(0,4).equals(name.substring(1, 5))){
                            indexName.insert(0, name.substring(0, 1));
                        }
                        else if(indexName.substring(indexName.length()-3).equals(name.substring(0, 3))){
                            indexName.append(name.substring(3, 5));
                        }
                        else if(indexName.substring(0,3).equals(name.substring(2, 5))){
                            indexName.insert(0, name.substring(0, 2));
                        }
                        else if(indexName.substring(indexName.length()-2).equals(name.substring(0, 2))){
                            indexName.append(name.substring(2, 5));
                        }
                        else if(indexName.substring(0,2).equals(name.substring(3, 5))){
                            indexName.insert(0, name.substring(0, 3));
                        }
                        else if(indexName.substring(0,1).equals(name.substring(4, 5))){
                            indexName.insert(0, name.substring(0, 4));
                        }
                        else if(indexName.substring(indexName.length()-1).equals(name.substring(0, 1))){
                            indexName.append(name.substring(1, 5));
                        }
                        else indexName.append(name);
                }
            }
        }
        return indexName.toString();
    }
}