package Exceptions3;

import Exceptions.UserNotFoundException;

public class Names {

    private String[] names;

    public Names(String[] names) {
        this.names = names;
    }

    public void validateUnique() {
        for(int i = 0; i < names.length; i++){
            for(int j = i + 1; j < names.length; j++){
                if(names[i].equals(names[j])){
                    throw new NotUniqueNamesException("Name {" + names[i] + "} is not unique");
                }
            }
        }
        System.out.println("Все имена уникальны!");
    }
}
