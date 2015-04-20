#TCP /IP
transport control protocol
there are two layers for the protocol
- top level handles conversion of message into smaller chunks of data,
- bottom level handles address of messages. the messages can be sent in different paths and are assembled at the destination

#https
this is http over SSL/TLS. The SSL handshake consists of 
- the client opening active connection with the server.
   - it gives details of the client including the latest SSL protocol supported by the client
   - ciphers supported for encoding/decoding
- server then sends information to client including certification which contains 
 - the public key
 - cipher algorithm from the list of algorithm selected
- the client uses the public certificate to encrypt random message which is then used as a SYMMETRIC KEY for further communication