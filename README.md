IS24 API SDK v0.1 beta (restapi-java-sdk)
==========================
Author:     Martin Flügge

Copyright:  Immobilien Scout GmbH

Link:       http://www.immobilienscout24.de


Das IS24 API SDK von ImmobilienScout24 steht unter der Apache Common License v2.0 zur Verfügung und kann für private sowie kommerzielle Projekte eingesetzt werden. Lediglich die Verweise wie Copyright, Autor, etc. müssen in den Dateien erhalten bleiben. Weitere Infos zur Lizenz befinden sich unter http://www.apache.org/licenses/LICENSE-2.0.

History
=======


Who  		  | When 		  | What
------------- | ------------- | ------------- 
mfluegge  	  | 10th June 2014| initial commit
mfluegge  	  | 10th June 2014| v0.1 beta
mfluegge  	  | 3th November 2014| v0.2 beta
mfluegge  	  | 4th November 2014| v0.2.3


v0.2.3
----------

Added externalId, message and messageCode to ShowcasePlacement, TopPlacment and PremiumPlacement.

v0.2.1
----------

Had to change artifactid to "restapi-java-sdk".

v0.2 beta
----------

- createRealestate(String username, RealEstate realestate) uses energy certificate data by default
- update realeste 
- upload of FileMultimediaObject now throw MaximumNumberOfAttachmentsReachedException when trying to upload attchment #31
- user can retrieve realestate project for a given realestate id
- realestate projects can be upated
- several methods to add realestates to a realestes projects were introduced
- realestates can be deleted from realestate projects
- On top products can be placed on realestates
- user can retrieve a list of on top products placed an a specific realestate
- On top products can be removed from realestates
- user can get a list of entitlements for a given username
- user can get a specific entitlement by name for a given user
