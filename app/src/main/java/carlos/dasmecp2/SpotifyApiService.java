package carlos.dasmecp2;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface SpotifyApiService {
    @GET("/v1/artists/{id}/top-tracks?country=ES")
    Call<TopTracks> getTopTracks(@Path("id") String artistId);

    @GET("/v1/search?type=artist")
    Call<Artists> getArtists(@Query("q") String q);
}
