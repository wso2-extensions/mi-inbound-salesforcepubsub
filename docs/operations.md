
# Working with pubsub Inbound Endpoint

## Overview

The **pubsub** inbound endpoint allows you to perform a set of predefined operations. Each operation corresponds to a remote procedure call (RPC) that interacts with the backend service.

Below is a list of available operations and their descriptions:

| Operation Name   |
|------------------|
| Subscribe |

---

## Operation Details

This section provides detailed information about each operation, including the expected input and output parameters.

### Subscribe RPC Operation

**Input Parameters**

The following table lists the input parameters required for this operation:

| Parameter Name   | Proto Type   |
|------------------|--------------|
| topic_name | TYPE_STRING |
| replay_preset | TYPE_ENUM |
| num_requested | TYPE_INT32 |
| replay_id | TYPE_BYTES |


**Output Parameters**

The following table lists the output parameters returned by this operation:

| Parameter Name | Proto Type   |
|---------------|--------------|
| event         | TYPE_MESSAGE |
| decodedPayload | TYPE_JSON    |
| replayId      | TYPE_BYTES   |
