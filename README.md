If using POST with HTTP redirect status code 307 (https://datatracker.ietf.org/doc/html/rfc7231#page-58), the Resource Owner becomes vulnerable for credential theft.

A malicious client receives the resource owners' credentials, when he provides an appropiate API as shown in the example.

1. Goto localhost:8080/home and type in credentials
2. Submit and optionally observe the network panel of your browser
3. The logs will show, that not only the authorization /redirect-endpoint received your credentials, but also the /client/redirect_uri-endpoint

Paper:
https://arxiv.org/pdf/1601.01229.pdf

