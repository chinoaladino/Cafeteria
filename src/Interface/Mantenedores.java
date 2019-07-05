/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author dell
 */
public interface Mantenedores<Cualquiercosa> {
    public boolean create(Cualquiercosa c);
    public boolean delete(Cualquiercosa c);
    public boolean update(Cualquiercosa c);
    public Cualquiercosa read(Cualquiercosa c);
    public List<Cualquiercosa> readAll();
}
