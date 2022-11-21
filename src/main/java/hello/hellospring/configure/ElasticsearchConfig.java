package hello.hellospring.configure;

//@Configuration
//@EnableElasticsearchRepositories(basePackages = "hello.hellospring.repository")
//@ComponentScan(basePackages = {"hello.hellospring"})
//public class ElasticsearchConfig extends AbstractElasticsearchConfiguration {
//
//    @Value("${elasticsearch.url}")
//    public String elasticsearchUrl;
//
//    @Bean
//    @Override
//    public RestHighLevelClient elasticsearchClient() {
//        final ClientConfiguration config = ClientConfiguration.builder()
//                .connectedTo(elasticsearchUrl)
//                .build();
//
//        return RestClients.create(config).rest();
//    }
//
//}
