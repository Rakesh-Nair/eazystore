import PageHeading from "./PageHeading";
import ProductListings from "./ProductListings";
import apiClient from "../api/apiClient";
import { useState, useEffect } from "react";

export default function Home() {
  const [products, setProducts] = useState([]);
  //Run once when the component mounts

  useEffect(() => {
    fetchProducts();
  }, []);

  const fetchProducts = async () => {
    const response = await apiClient.get("/products");

    setProducts(response.data);
    
  };
  return (
    <div className="max-w-[1152px] mx-auto px-6 py-8">
      <PageHeading title="Explore Eazy Stickers!">
        Add a touch of creativity to your space with our wide range of fun and
        unique stickers. Perfect for any ocassion!
      </PageHeading>
      <ProductListings products={products} />
    </div>
  );
}
