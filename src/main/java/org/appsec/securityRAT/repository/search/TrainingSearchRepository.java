package org.appsec.securityRAT.repository.search;

import org.appsec.securityRAT.domain.Training;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the Training entity.
 */
public interface TrainingSearchRepository extends ElasticsearchRepository<Training, Long> {
}
