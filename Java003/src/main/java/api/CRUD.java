package api;

import java.util.List;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */
public interface CRUD<DTO, ENTITY> {

    // create - 게시글을 쓴 사용자 이름, 게시글을 입력하는 request를 받을 DTO
    ENTITY create(String user, DTO dto);

    // read
    ENTITY read(Integer id);

    List<ENTITY> readAll();

    // update
    ENTITY update(Integer id, DTO dto);

    // delete
    void delete(Integer id);

}
