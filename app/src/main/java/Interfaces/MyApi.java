package Interfaces;

import models.Post;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface MyApi {
    @GET("posts")
    Call<List<Post>> getPosts();
}

