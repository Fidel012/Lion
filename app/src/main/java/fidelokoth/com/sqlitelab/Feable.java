package fidelokoth.com.sqlitelab;

/**
 * Created by FIDEL OKOTH on 24/10/2017.
 */

class Feable {
    //private variables
    int _uid;
    String _uname;
    String _ucode;
    //empty constructor
    public Feable(){

    }
    public Feable(int _uid, String _uname, String _ucode){
        this._uid =_uid;
        this._uname =_uname;
        this._ucode=_ucode;

    }

    public Feable(String _uname, String _ucode){
        this._uname = _uname;
        this._ucode = _ucode;
    }

    public int get_uid() {
        return _uid;
    }

    public void set_uid(int _id) {
        this._uid = _uid;
    }

    public String get_uname() {
        return _uname;
    }

    public void set_uname(String _uname) {
        this._uname = _uname;
    }

    public String get_ucode() {
        return _ucode;
    }

    public void set_ucode(String _ucode) {
        this._ucode = _ucode;
    }

}
