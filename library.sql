PGDMP                 
    	    y            library    13.3    13.2 
    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16484    library    DATABASE     d   CREATE DATABASE library WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE library;
                postgres    false            ?            1259    16485    authors    TABLE     d   CREATE TABLE public.authors (
    id numeric NOT NULL,
    "fullName" character varying NOT NULL
);
    DROP TABLE public.authors;
       public         heap    postgres    false            ?            1259    16493    books    TABLE     ?   CREATE TABLE public.books (
    id numeric NOT NULL,
    name character varying NOT NULL,
    type character varying NOT NULL,
    "authorId" character varying NOT NULL
);
    DROP TABLE public.books;
       public         heap    postgres    false            ?          0    16485    authors 
   TABLE DATA           1   COPY public.authors (id, "fullName") FROM stdin;
    public          postgres    false    200   ;	       ?          0    16493    books 
   TABLE DATA           ;   COPY public.books (id, name, type, "authorId") FROM stdin;
    public          postgres    false    201   ?	       '           2606    16492    authors authors_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.authors
    ADD CONSTRAINT authors_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.authors DROP CONSTRAINT authors_pkey;
       public            postgres    false    200            )           2606    16500    books books_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.books DROP CONSTRAINT books_pkey;
       public            postgres    false    201            ?   ?   x?5?M
?0FיS??Zo?a?A\\?RTĕZ*????͍?T\~?7/;v?]<]ui#??q??񜈼ȼ	???\?L/ӒI?H??????/??tS?T??=?ح?fŏ??????̱?i?/???7$??D?goy      ?   ?   x?}?Mn?0???S?H????06He??Q??5?	??D?\??F<;,?E?????y????3<?T?jD?_D4???9??	"Z??P
??m5B?Bk??? C3??????+ۑ??G?????BGܕ??`KӜ???@??(??d~%?4?=T^?L?D???eR?%?U?j?9?s?>??o?
??ӊFE?ǫ?k???D?"c?!8?????J?[I??Wge?ybf?q!???X??,???ρ1?$?     