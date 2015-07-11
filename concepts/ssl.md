# SSL Handshake
this is a simplified workflow of what happens when

## Handshake
- browser goes to a URL over HTTPS
- server sends certificate
- browser verifies the certificate is valid
 - checks if the issued domain matches with certificate domain
 - checks if the issuer is verified 

HTTP as a protocol does not have any security features. HTTPS is HTTP over TLS where TLS is a tunneling protocol which adds security. TLS provides more than authentication

## TLS

#### authentication 
> you are talking to who you think you are talking to
- done using certificates

#### integrity
> the data that you send to the server is not changed
- done using 
#### replay
> the request that you make cannot be recreated again by someone else

#### encryption
> the data that you send to the server is not read by anyone else


