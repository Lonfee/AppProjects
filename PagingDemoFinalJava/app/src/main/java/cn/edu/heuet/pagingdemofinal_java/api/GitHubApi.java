package cn.edu.heuet.pagingdemofinal_java.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @ClassName GitHubApi
 * @Author littlecurl
 * @Date 2020/1/8 10:03
 * @Version 1.0.0
 * @Description TODO
 */
public interface GitHubApi {
    /**
     * Get repos ordered by stars.
     * 注意这里泛型是：RepoSearchResponse
     * 不要和model包下的RepoSearchResult搞混了（我开始的时候就搞混了 [尴尬.png]）
     */
    @GET("search/repositories?sort=stars")
    Call<RepoSearchResponse> searchRepos(
            @Query("q") String query,
            @Query("page") int page,
            @Query("per_page") int itemsPerPage
    );
}

