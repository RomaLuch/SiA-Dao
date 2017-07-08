package dao;

import model.Spitter;

/**
 * Created by Рома on 01.07.2017.
 */
public interface Rep {
    void addSpitter(Spitter spitter);
    void saveSpitter(Spitter spitter);
    Spitter getSpitterById(long id);
}
