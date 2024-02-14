package api;

import java.util.List;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */
public interface CRUD<DTO, ENTITY> {

    // create
    ENTITY create(String user, DTO dto);

    // read
    ENTITY read(Integer id);

    List<ENTITY> readAll();

    // update
    ENTITY update(Integer id, DTO dto);

    // delete
    void delete(Integer id);

}
