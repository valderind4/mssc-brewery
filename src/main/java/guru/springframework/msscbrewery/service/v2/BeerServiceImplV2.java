package guru.springframework.msscbrewery.service.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImplV2 implements BeerServiceV2{

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {

    }
}
