package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> {

    /**
     * The class should instantiate a List field of E objects named personList.
     */

    protected List<E> personList = new ArrayList<>();

    /**
     * The class should define a method named add which adds a E to the personList.
     */

    public void add(E person){
        personList.add(person);
    }

    /**
     * The class should define a method named findById which makes use of a
     * long id parameter to return a E object with the respective id field.
     */

    public E findById(Long id){
        for ( E p : personList ) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    /**
     * The class should define a named contains which makes use of a E person parameter
     * to return true if the personList contains the respective E object.
     */

    public boolean contains(E person){
        return personList.contains(person);
    }

    /**
     * The class should define a method named remove which makes use of a E person parameter
     * to remove a respective E object.
     */

    public void remove(E person){
        personList.remove(person);
    }

    /**
     * The class should define a method named remove which makes use of a
     * long id parameter to remove a E object with the respective id field.
     */

    public void removeById(Long id){
        remove(findById(id));
    }

    /**
     * The class should define a named removeAll which clears our personList field.
     */

    public void removeAll(){
        personList.clear();
    }

    /**
     * The class should define a method named count which returns the size of personList.
     */
     public int count(){
         return personList.size();
     }

    /**
     * The class should define a method named toArray which returns an array
     * representation of the personList field.
     */

//    public E[] toArray(){
//        return personList.toArray(new E[personList.size()]);
//    }

    abstract public E[] toArray();

    /**
     * The class should implement Iterable<E> and define a method named
     * iterator which makes use of the personList field to generate a new a Iterator<E>.
     */

    public Iterator iterator(){
        return this.personList.iterator();
    }

}
