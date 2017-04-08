package br.com.acgnogueira.carango3.api;

import java.util.List;

import br.com.acgnogueira.carango3.model.Carro;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by logonrm on 08/04/2017.
 */

public interface CarroAPI {

    @GET("/carros/tipo/{tipo}.json")
    Call<List<Carro>> buscarCarros(@Path("tipo") String tipo);

}
