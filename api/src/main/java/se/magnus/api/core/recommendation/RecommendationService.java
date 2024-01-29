package se.magnus.api.core.recommendation;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface RecommendationService {

    @GetMapping(
        value    = "/recommendation",
        produces = "application/json")

        /**
         * Sample usage: curl $HOST:$PORT/recommendation?productId=1
         * @param productId
         * @return the recommendations for the specified product
         */
    List<Recommendation> getRecommendations(
        @RequestParam(value = "productId", required = true) int productId);
    
}
