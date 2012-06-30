jaddress
========

Java Open Address Library

WARNING - This is really a work in progress right now. Very incomplete and pretty much only a proof of concept at this time

This is meant to be an open implementation of addresses (postal/mail). It would be reused in every project where addresses
are used. I would like to support addresses from every country and in every language. Input validation should be done in
accordance to every country official format. Likewise, once the data has been entered, it should be possible to retrieve
it as a simple string formatted perfectly according to the country standards.

It has been my experience that every project I worked on defined address as part of the system. The addresses are often
incomplete and do not work for corner cases or when the systems are ported to new countries.

Development:
Development is loosely based on (http://en.wikipedia.org/wiki/Address_(geography))
-Complete unit tests suite
-Complete sample case test suite made from actual addresses
-Code should be organized by country
-Coding should be consistent between the different country implementations

Roadmap:
-Creating bean for Canadian addresses
(based on http://www.canadapost.ca/tools/pg/manual/PGaddress-e.asp)
-Creating bean for New Zealand addresses
(based on http://www.nzpost.co.nz/sending-within-nz/how-to-address-mail/different-address-types-envelope-layout
and http://www.nzpost.co.nz/sending-within-nz/how-to-address-mail/standards-guides)
-Creating bean for Australia addresses
(based on http://auspost.com.au/personal/addressing-guidelines.html)
-Creating bean for USA addresses
(based on http://pe.usps.gov/text/pub28/welcome.htm)
-Creating proper output for the existing addresses
-Add proper input validation to existing addresses
-Create a demo application for existing addresses
-Support other address formats going through the list of wikipedia countries
-Link address/countries to ISO locale/languages
-Add class definitions that map to JPA (as a separate jar libary linked).
-Support UTF-8 and other languages

Milestones:
Milestone names are based on famous street names/addresses. There will be one release per month.
1 - Proof of concept
2 - Baker Street
3 - Privet Drive
4 - ??