package fidelokoth.com.sqlitelab;

/**
 * Created by FIDEL OKOTH on 19/10/2017.
 */

public class Contacts {
    //private variables
    int _id;
    String _name;
    String _phone_number;

    //Empty constructor
    public Contacts(){}

    //constructor
    public Contacts(int id, String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;
    }

    //constructor
    public Contacts(String name, String _phone_number) {

    }

    //getting ID
    public int getID(){
        return this._id;
    }
    //setting id
    public void setID(int _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getphoneNumber() {
        return _phone_number;
    }

    public void setphoneNumber(String _phone_number) {
        this._phone_number = _phone_number;
    }

    public static void setPhoneNumber(String string) {
    }
}
