package api;

import dto.PostRequest;
import entity.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KimKyungHo on 2024-02-14(014)
 */

/*
TODO
 1. interface(CRUD)를 구현하세요 (입력 -> PostRequest, 출력 -> Post)
 2. 메뉴에 있는 저장, 단건조회, 전체조회 3가지만 진행
 */
public class PostApi implements CRUD<PostRequest, Post> {

    /*
    TODO 게시글을 관리하는 리스트의 타입을 지정해주세요
     */
    public static List<Post> list = new ArrayList<>();

    private int id = 0;
    @Override
    public Post create(String user, PostRequest postRequest) {
        id=id+1;
        Post post = new Post(postRequest.getTitle(), postRequest.getMessage(), user, id);
        list.add(post);
        return post;
        //return list.get(list.size()-1);
    }

    @Override
    public Post read(Integer id) {
        Post emptyPost = new Post(null, null, null, -1);
        for (Post post : list) {
            if (id == post.getId()){
                emptyPost=post;
            }
        }
        return emptyPost;
    }

    @Override
    public List<Post> readAll() {
        return list;
    }

    @Override
    public Post update(Integer id, PostRequest postRequest) {
        Post emptyPost = new Post(null, null, null, -1);
        for (Post post : list) {
            if (id == post.getId()){
                post.setTitle(postRequest.getTitle());
                post.setMessage(postRequest.getMessage());
                emptyPost=post;
            }
        }
        return emptyPost;
    }

    public Post update(int updateId, String updateObject, int num){
        Post emptyPost = new Post(null, null, null, -1);
        for (Post post : list) {
            if (updateId == post.getId()){
                if (num ==1){
                    post.setTitle(updateObject);
                    emptyPost=post;
                } else if (num==2) {
                    post.setMessage(updateObject);
                    emptyPost=post;
                }
            }
        }
        return emptyPost;
    }

    @Override
    public void delete(Integer id) {
        for (Post post : list) {
            if(id == post.getId()){
                list.remove(post);
            }
        }
    }
}
