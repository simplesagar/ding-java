# DeliveryStatus


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                  | Type                                                                                                                                                                                                                                                                                                                                                                                   | Required                                                                                                                                                                                                                                                                                                                                                                               | Description                                                                                                                                                                                                                                                                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `attemptId`                                                                                                                                                                                                                                                                                                                                                                            | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                     | The ID of the attempt.                                                                                                                                                                                                                                                                                                                                                                 |
| `attemptNumber`                                                                                                                                                                                                                                                                                                                                                                        | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                     | The attempt number.                                                                                                                                                                                                                                                                                                                                                                    |
| `createdAt`                                                                                                                                                                                                                                                                                                                                                                            | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                    |
| `status`                                                                                                                                                                                                                                                                                                                                                                               | [Optional\<AuthenticationStatusResponseStatus>](../../models/shared/AuthenticationStatusResponseStatus.md)                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                     | The status of the delivery. Possible values are:<br/>  * `unknown` - The status of the delivery is unknown.<br/>  * `submitted` - The message has been submitted to the carrier.<br/>  * `in_transit` - The message is in transit to the recipient.<br/>  * `delivered` - The message has been delivered to the recipient.<br/>  * `undeliverable` - The message could not be delivered to the recipient.<br/> |
| `type`                                                                                                                                                                                                                                                                                                                                                                                 | [Optional\<AuthenticationStatusResponseSchemasType>](../../models/shared/AuthenticationStatusResponseSchemasType.md)                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                     | The type of the event.                                                                                                                                                                                                                                                                                                                                                                 |