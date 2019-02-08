//;//GRAFO NO DIRIGIDO
////Ejercicio 10 Grafo bipartito
///**
//*
//* Copyright (c) 2010 Matthias Walter (xammy@xammy.homelinux.net)
//*
//* Authors: Matthias Walter
//*
//* Distributed under the Boost Software License, Version 1.0. (See
//* accompanying file LICENSE_1_0.txt or copy at
//* http://www.boost.org/LICENSE_1_0.txt)
//*
//*/
//
//#include <iostream>
//#include <boost/graph/adjacency_list.hpp>
//#include <boost/graph/bipartite.hpp>
//
//using namespace boost;
//using namespace std;
//
//typedef adjacency_list <vecS, vecS, undirectedS> Graph;
//template <typename Graph>
//void print_bipartite(const Graph& g)
//{
//	if (is_bipartite(g)) {
//		cout << "SI\n";
//
//	}
//	else {
//		cout << "NO\n";
//	}
//}
//
//void readGraph(Graph &gr, int aristas) {
//
//	int v1, v2;
//	for (size_t i = 0; i < aristas; i++) {
//		cin >> v1;
//		cin >> v2;
//		add_edge(v1, v2, gr);
//	}
//}
//int main()
//{
//	typedef adjacency_list <vecS, vecS, undirectedS> Graph;
//	typedef std::pair <int, int> E;
//
//	while (cin) {
//		int aristas;
//		int vertices;
//		cin >> vertices;
//		cin >> aristas;
//		Graph gr(vertices);
//		readGraph(gr, aristas);
//		print_bipartite(gr);
//	}
//	return 0;
//}
