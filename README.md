```
2023-12-06 14:21:20.458  INFO 76350 --- [   scheduling-1] c.e.s.scheduled.Scheduler                : Scheduler A
2023-12-06 14:21:20.464  INFO 76350 --- [   scheduling-1] c.e.s.scheduled.Scheduler                : Scheduler B
2023-12-06 14:21:20.468  INFO 76350 --- [cTaskExecutor-1] c.e.springbootexample.service.Service    : Scheduler to  service A
2023-12-06 14:21:20.468  INFO 76350 --- [        other-1] c.e.springbootexample.service.Service    : Scheduler to  service B
2023-12-06 14:21:22.310  INFO 76350 --- [nio-8080-exec-1] c.e.s.controller.Controller              : Controller A
2023-12-06 14:21:22.310  INFO 76350 --- [cTaskExecutor-2] c.e.springbootexample.service.Service    : Controller to  service A
2023-12-06 14:21:24.250  INFO 76350 --- [nio-8080-exec-2] c.e.s.controller.Controller              : Controller B
2023-12-06 14:21:24.251  INFO 76350 --- [        other-1] c.e.springbootexample.service.Service    : Controller to  service B

```
