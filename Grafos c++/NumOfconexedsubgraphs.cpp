////GRAFO NO DIRIGIDO
////Ejercicio Componentes numero de componentes conexas
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
//#include <string>
//#include <boost/graph/adjacency_list.hpp>
//#include <boost/graph/depth_first_search.hpp>
//#include <boost/cstdlib.hpp>
//
//using namespace boost;
//using namespace std;
//class dfs_time_visitor :public default_dfs_visitor {
//
//public:
//	dfs_time_visitor(size_t & t) :counter(t) { }
//	template < typename Vertex, typename Graph >
//	void discover_vertex(Vertex u, const Graph & g) {
//		counter++;
//	}
//private:
//	size_t & counter;
//};
//
//typedef adjacency_list <vecS, vecS, undirectedS> Graph;
//template <typename Graph>
//void number_of_conexed_components(const Graph& g) {
//	size_t counter = 1;
//	dfs_time_visitor  vis(counter);
//
//	std::vector<default_color_type> vertex_color(num_vertices(g));
//	std::map<Graph::edge_descriptor, default_color_type> edge_color;
//
//	auto idmap = get(vertex_index, g);
//	auto vcmap = make_iterator_property_map(vertex_color.begin(), idmap);
//	auto ecmap = make_assoc_property_map(edge_color);
//	int max = 0;
//	int cont = 0;
//
//	int i = 0;
//	while (i < num_vertices(g)) {
//		typename graph_traits<Graph>::vertex_descriptor start = i;
//		if (vertex_color.at(i) == white_color) {
//			depth_first_visit(g, start, vis, vcmap);
//			cont++;
//		}
//		i = counter - 1;
//	}
//	cout << cont << endl;
//}
//
//void readGraph(Graph &gr, int aristas) {
//
//	int v1, v2;
//	for (size_t i = 0; i < aristas; i++) {
//		cin >> v1;
//		cin >> v2;
//		add_edge(v1 - 1, v2 - 1, gr);
//	}
//}
//int main()
//{
//	typedef adjacency_list <vecS, vecS, undirectedS> Graph;
//	typedef std::pair <int, int> E;
//	int tam = 0;
//	int i = 0;
//	cin >> tam;
//	while (i < tam) {
//		int aristas;
//		int vertices;
//		cin >> vertices;
//		cin >> aristas;
//		Graph gr(vertices);
//		readGraph(gr, aristas);
//		number_of_conexed_components(gr);
//		i++;
//	}
//	return 0;
//}